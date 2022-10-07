class Solution {
public:
    ListNode* sortList(ListNode* head) {
        vector<int>v;
        struct ListNode*temp=head;
        while(temp!=NULL){
            v.push_back(temp->val);
            temp=temp->next;
        }
        
        temp=head;
        sort(v.begin(),v.end());
        int i=0;
        while(temp!=NULL and i<v.size()){
           temp->val=v[i];
            temp=temp->next;
            i++;
        }
        return head;
    }
};
